package misk.metrics.backends.prometheus

import com.google.common.util.concurrent.AbstractIdleService
import io.prometheus.client.CollectorRegistry
import io.prometheus.client.exporter.HTTPServer
import misk.logging.getLogger
import java.net.InetSocketAddress
import javax.inject.Inject

internal class PrometheusHttpService @Inject internal constructor(
  private val config: PrometheusConfig,
  private val registry: CollectorRegistry
) : AbstractIdleService() {

  private var httpServer: HTTPServer? = null

  override fun startUp() {
    log.info { "exposing prometheus metrics on port ${config.http_port}" }

    val socketAddr = if (config.hostname == null) InetSocketAddress(config.http_port)
    else InetSocketAddress(config.hostname, config.http_port)
    httpServer = HTTPServer(socketAddr, registry)
  }

  override fun shutDown() {
    log.info { "shutting down prometheus metrics endpoint" }
    httpServer?.stop()
  }

  private companion object {
    val log = getLogger<PrometheusHttpService>()
  }
}
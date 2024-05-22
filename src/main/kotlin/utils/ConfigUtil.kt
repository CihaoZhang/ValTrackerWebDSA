package utils

import com.sksamuel.hoplite.ConfigLoader

class ConfigUtil {

    class ConfigUtil {
        data class Config(
            val ktor: KtorConfig,
        )

        data class KtorConfig(
            val host: String,
            val port: Int
        )

        companion object {
            fun loadConfig(): Config {
                val pwd = System.getProperty("user.dir")
                return ConfigLoader().loadConfigOrThrow("$pwd/conf/config.yaml")
            }
        }
    }

}
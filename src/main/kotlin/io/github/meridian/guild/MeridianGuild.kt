package io.github.meridian.guild

import io.github.meridian.features.FeatureManager
import net.fabricmc.api.ClientModInitializer

object MeridianGuild : ClientModInitializer {
    override fun onInitializeClient() {
        // Meridian already ran load() before this entrypoint, so re-load to pick up our features' saved state.
        FeatureManager.load()
    }
}

package es.chiteroman.AntiSnowballCrash.mixin;

import es.chiteroman.AntiSnowballCrash.modules.AntiSnowballCrash;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.EntityType;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayNetworkHandler.class)
public class ClientPlayNetworkHandlerMixin {

    @Inject(method = "onEntitySpawn", at = @At("HEAD"), cancellable = true)
    private void onEntitySpawn(EntitySpawnS2CPacket packet, CallbackInfo info) {
        if (EntityType.SNOWBALL.equals(packet.getEntityTypeId())) {
            if (Modules.get().get(AntiSnowballCrash.class).isActive()) {
                info.cancel();
            }
        }
    }
}

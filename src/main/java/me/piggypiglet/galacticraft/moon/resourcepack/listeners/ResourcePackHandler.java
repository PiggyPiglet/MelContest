/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2020 PiggyPiglet
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of Galacticraft and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of Galacticraft.
 *
 * GALACTICRAFT IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.piggypiglet.galacticraft.moon.resourcepack.listeners;

import me.piggypiglet.galacticraft.annotations.scanning.Hidden;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.jetbrains.annotations.NotNull;

import static me.piggypiglet.galacticraft.moon.MoonConstants.MOON_RP;
import static me.piggypiglet.galacticraft.moon.MoonConstants.MOON_RP_HASH;

@Hidden
public final class ResourcePackHandler implements Listener {
    @EventHandler
    public void onMoonJoin(@NotNull final PlayerJoinEvent event) {
        final Player player = event.getPlayer();

        player.setResourcePack(MOON_RP, MOON_RP_HASH);
    }
}

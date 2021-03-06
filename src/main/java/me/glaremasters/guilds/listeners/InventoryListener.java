/*
 * MIT License
 *
 * Copyright (c) 2018 Glare
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.glaremasters.guilds.listeners;

import ch.jalu.configme.SettingsManager;
import lombok.AllArgsConstructor;
import me.glaremasters.guilds.guild.GuildHandler;
import org.bukkit.event.Listener;

/**
 * Created by GlareMasters
 * Date: 11/8/2018
 * Time: 11:51 PM
 */
@AllArgsConstructor
public class InventoryListener implements Listener {

    //todo

    private GuildHandler guildHandler;
    private SettingsManager settingsManager;

/*    *//**
     * This event just checks if a player is clicking on the next or back page and making sure you can't dupe from the GUIs
     * @param event
     *//*
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        UUID uuid = player.getUniqueId();
        String title = event.getInventory().getTitle();
        //todo you should not be comparing using names but rather using InventoryHolders.
        if (title.equalsIgnoreCase(settingsManager.getProperty(GuildBuffSettings.GUILD_LIST_NAME))) {
            if (event.getAction().equals(InventoryAction.PICKUP_ALL)) {
                if (event.getCurrentItem().getItemMeta().getDisplayName().equals(settingsManager.getProperty(GuildBuffSettings.GUILD_LIST_PREVIOUS_PAGE_ITEM_NAME))) {
*//*                    if (!(playerPages.get(uuid) == 1)) {
                        int newPage = playerPages.get(uuid) - 1;
                        playerPages.remove(uuid);
                        playerPages.put(uuid, newPage);
                        Inventory guildList = getSkullsPage(newPage);
                        player.openInventory(guildList);
                    }*//*
                }
                if (guildHandler.getGuildsSize() < 45) {
                    event.setCancelled(true);
                    event.setResult(Event.Result.DENY);
                    return;
                }
                if (event.getCurrentItem().getItemMeta().getDisplayName().equals(settingsManager.getProperty(GuildBuffSettings.GUILD_LIST_NEXT_PAGE_ITEM_NAME))) {
*//*                    int newPage = playerPages.get(uuid) + 1;
                    playerPages.remove(uuid);
                    playerPages.put(uuid, newPage);
                    Inventory guildList = getSkullsPage(newPage);
                    player.openInventory(guildList);*//*
                }
            }
            event.setCancelled(true);
            event.setResult(Event.Result.DENY);
        }
    }*/

/*    *//**
     * This event is a double check to make sure you can't dupe from the GUIs
     * @param event
     *//*
    @EventHandler
    public void onInventoryInteract(InventoryInteractEvent event) {
        String title = event.getInventory().getTitle();
        if (title.equals(settingsManager.getProperty(GuildBuffSettings.GUILD_LIST_NAME))) {
            event.setCancelled(true);
            event.setResult(Event.Result.DENY);
        }
    }*/
}

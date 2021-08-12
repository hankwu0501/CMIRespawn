package com.gmail.hankwu0501.listners

import com.Zrips.CMI.CMI
import org.bukkit.Bukkit.getServer
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerRespawnEvent

class RespawnHandle : Listener {
    @EventHandler
    fun onDeathEvent(e: PlayerRespawnEvent) {
        val homecount = CMI.getInstance().playerManager.getUser(e.player).validHomeCount
        if (homecount == 0) {
            val playername = e.player.name
            getServer().dispatchCommand(getServer().consoleSender, "cmi rt $playername world")
            e.player.sendMessage("由於你沒有任何重生點，系統自動幫你隨機傳送到了新的地方")
        }
    }
}

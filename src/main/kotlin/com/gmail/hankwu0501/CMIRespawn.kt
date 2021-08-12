package com.gmail.hankwu0501

import com.gmail.hankwu0501.listners.RespawnHandle
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class CMIRespawn :JavaPlugin(){
    companion object{
        lateinit var instance: CMIRespawn
    }
    init {
        instance = this
    }
    override fun onEnable() {
        Bukkit.getPluginManager().registerEvents(RespawnHandle(),this)
        instance.logger.info("恭喜插件啟動成功")
    }

}
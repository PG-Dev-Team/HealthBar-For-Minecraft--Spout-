package me.plornt.healthbar;

import org.bukkit.plugin.Plugin;

import com.herocraftonline.heroes.Heroes;
import com.herocraftonline.heroes.characters.CharacterManager;

public class HealthBarHeroes {
    static CharacterManager pl;

    HealthBarHeroes(Plugin hl) {
        pl = (CharacterManager) ((Heroes) hl).getCharacterManager();
    }
}

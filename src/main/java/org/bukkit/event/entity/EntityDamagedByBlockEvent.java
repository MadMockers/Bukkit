package org.bukkit.event.entity;

import org.bukkit.Block;
import org.bukkit.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;

/**
 * Stores details for damage events where the damager is a block
 */
public class EntityDamagedByBlockEvent extends EntityDamagedEvent implements Cancellable {

    private Block damager;

    public EntityDamagedByBlockEvent(Block damager, Entity damagee, DamageCause cause, int damage)
    {
        super(Event.Type.ENTITY_DAMAGEDBY_BLOCK, damagee, cause, damage);
        this.damager = damager;
    }

    /**
     * Returns the block that damaged the player.
     * @return Block that damaged the player
     */
    public Block getDamager()
    {
        return damager;
    }

}

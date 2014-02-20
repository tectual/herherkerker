package com.tectual.herherkerker.events;

import com.tectual.herherkerker.models.Reward;

/**
 * Created by arash on 13/02/2014.
 */
public class RedeemEvent {


    public Reward reward;
    public boolean is_won;
    public int position;

    public RedeemEvent(Reward reward, int position, boolean is_won){
        this.reward = reward;
        this.is_won = is_won;
        this.position = position;
    }
}

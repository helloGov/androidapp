/*
 * Created by James Henderson on 2019
 * Copyright (c) Hendercine Productions and James Henderson 2019.
 * All rights reserved.
 *
 * Last modified 2/11/19 7:30 PM
 */

package org.hackforla.hellogov.data.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import org.hackforla.hellogov.data.model.Campaign;

import java.util.List;
/**
 * helloGov created by hendercine on 2/11/19.
 */

@Dao
public interface CampaignDao {

    @Insert(onConflict = OnConflictStrategy.FAIL)
    void insertCampaign(Campaign campaign);

    @Update
    void updateCampaign(Campaign campaign);

    @Delete
    void deleteCampaign(Campaign campaign);

    @Query("DELETE FROM campaign_table")
    void deleteAll();

    @Query("SELECT * from campaign_table ORDER BY _id")
    LiveData<List<Campaign>> getAllUsers();

}

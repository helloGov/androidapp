/*
 * Created by James Henderson on 2019
 * Copyright (c) Hendercine Productions and James Henderson 2019.
 * All rights reserved.
 *
 * Last modified 2/11/19 7:38 PM
 */

package org.hackforla.hellogov.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import org.hackforla.hellogov.data.dao.CampaignDao;
import org.hackforla.hellogov.data.model.Campaign;

/**
 * helloGov created by hendercine on 2/11/19.
 */

@Database(entities = {Campaign.class}, version = 1)
public abstract class CampaignRoomDatabase extends RoomDatabase {

    public abstract CampaignDao campaignDao();

    private static volatile CampaignRoomDatabase INSTANCE;

    public static CampaignRoomDatabase getCampaignDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (CampaignRoomDatabase.class) {
                if (INSTANCE == null) {
                    // Create database here
                    INSTANCE =
                            Room.databaseBuilder(context.getApplicationContext(), CampaignRoomDatabase.class, "campaign_database")
                                    .build();
                }
            }
        }
        return INSTANCE;
    }
}

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

import org.hackforla.hellogov.data.dao.EventDao;
import org.hackforla.hellogov.data.model.Event;

/**
 * helloGov created by hendercine on 2/11/19.
 */

@Database(entities = {Event.class}, version = 1)
public abstract class EventRoomDatabase extends RoomDatabase {

    public abstract EventDao eventDao();

    private static volatile EventRoomDatabase INSTANCE;

    public static EventRoomDatabase getEventDatabase(final Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(),
                            EventRoomDatabase.class, "event_database")
                            .build();
        }
        return INSTANCE;
    }
}

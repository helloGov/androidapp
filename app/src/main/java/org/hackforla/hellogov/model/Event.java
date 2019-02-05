/*
 * Created by James Henderson on 2018
 * Copyright (c) Hendercine Productions and James Henderson 2018.
 * All rights reserved.
 *
 * Last modified 12/17/18 7:58 PM
 */

package org.hackforla.hellogov.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
/**
 * helloGov created by hendercine on 12/17/18.
 */

@Entity(tableName = "event_table")
public class Event {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private int mId;

    @ColumnInfo(name = "firstName")
    String mType;

    @ColumnInfo(name = "lastName")
    String mIp;

    @ColumnInfo(name = "user")
    User mUser;

    @ColumnInfo(name = "campaign")
    String mCampaign;

}

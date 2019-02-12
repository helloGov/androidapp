/*
 * Created by James Henderson on 2018
 * Copyright (c) Hendercine Productions and James Henderson 2018.
 * All rights reserved.
 *
 * Last modified 12/17/18 7:57 PM
 */

package org.hackforla.hellogov.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
/**
 * helloGov created by hendercine on 12/17/18.
 */
@Entity(tableName = "campaign_table")
public class Campaign {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private String mId;

    @ColumnInfo(name = "title")
    private String mTitle;

    @ColumnInfo(name = "script")
    private String mScript;

    @ColumnInfo(name = "thank_you")
    private String mThankYou;

    @ColumnInfo(name = "learn_more")
    private String mLearnMore;

    @ColumnInfo(name = "publish")
    private String mPublish;

    @ColumnInfo(name = "user")
    private User mUser;

}

/*
 * Created by James Henderson on 2018
 * Copyright (c) Hendercine Productions and James Henderson 2018.
 * All rights reserved.
 *
 * Last modified 12/17/18 7:41 PM
 */

package org.hackforla.hellogov.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
/**
 * helloGov created by hendercine on 12/17/18.
 */
@Entity(tableName = "user_table")
public class User {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private int mId;

    @NonNull
    @ColumnInfo(name = "firstName")
    private String mFirstName;

    @ColumnInfo(name = "lastName")
    private String mLastName;

    @ColumnInfo(name = "email")
    private String mEmail;

    @ColumnInfo(name = "bio")
    private String mBio;

    @ColumnInfo(name = "oauthID")
    private String mOauthId;

    @ColumnInfo(name = "image")
    private String mImageUrl;

    @ColumnInfo(name = "admin")
    private boolean mAdmin;

    @ColumnInfo(name = "password")
    private String mPassword;

}

package com.example.sarath.udacityclass.Room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {User.class},version = 1)
public abstract class MyDatabase extends RoomDatabase
{
   public abstract MyDao myDao();
}

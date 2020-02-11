package com.butteneers.koi.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.butteneers.koi.dao.CaractereDao;
import com.butteneers.koi.entity.Caractere;

@Database(entities = {Caractere.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract CaractereDao userDao();
}


/*AppDatabase db = Room.databaseBuilder(getApplicationContext(),
        AppDatabase.class, "database-name").build();*/
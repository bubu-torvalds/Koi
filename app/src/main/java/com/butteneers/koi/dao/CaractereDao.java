package com.butteneers.koi.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.butteneers.koi.entity.Caractere;

import java.util.List;

@Dao
public interface CaractereDao {

    @Query("SELECT * FROM caractere")
    List<Caractere> getAll();

    @Query("SELECT * FROM caractere WHERE uid IN (:caractereIds)")
    List<Caractere> loadAllByIds(int[] caractereIds);

    /*@Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    Caractere findByName(String first, String last);*/

    @Insert
    void insertAll(Caractere... caracteres);

    @Delete
    void delete(Caractere caractere);
}

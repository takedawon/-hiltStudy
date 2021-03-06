package com.example.study.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TravelEntity::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun travelDao(): TravelDao
}

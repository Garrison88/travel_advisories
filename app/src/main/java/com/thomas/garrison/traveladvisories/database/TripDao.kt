package com.thomas.garrison.traveladvisories.database

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.thomas.garrison.traveladvisories.database.Trip

@Dao
interface TripDao {

    @Query("SELECT * FROM trip")
    fun getAllTrips(): LiveData<List<Trip>>

    @Insert
    fun insert(trip: Trip)
}
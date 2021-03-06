package com.thomas.garrison.traveladvisories.database

import android.arch.persistence.room.Insert
import com.thomas.garrison.traveladvisories.api.Advisory

interface AdvisoryDao {

    @Insert
    fun insertAdvisory(advisory: Advisory)

}
package com.diegoalvis.composechat.data.respository

import com.diegoalvis.composechat.data.model.Profile

interface ProfileRepository {

    suspend fun getProfile(): Profile

}
package com.coroutines.api.wiki

import com.coroutines.models.synonyms.HistoryDay
import com.coroutines.models.synonyms.HistoryMonth
import com.coroutines.models.wiki.WikiEvent

class WikiMediaApiServiceImpl  constructor(private val apiService: WikiMediaApiService) : WikiMediaApi {
    override suspend fun getHistoricalEvents(
        historyMonth: HistoryMonth,
        historyDay: HistoryDay,
        language: String,
        option: String,
    ): WikiEvent = apiService.getWikimediaPage(historyMonth, historyDay, language, option)
}
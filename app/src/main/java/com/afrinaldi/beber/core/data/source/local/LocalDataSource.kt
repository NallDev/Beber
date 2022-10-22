package com.afrinaldi.beber.core.data.source.local

import com.afrinaldi.beber.core.data.source.local.entity.NewsEntity
import com.afrinaldi.beber.core.data.source.local.room.NewsDao
import kotlinx.coroutines.flow.Flow

class LocalDataSource(private val newsDao: NewsDao) {
    fun getAllNews(): Flow<List<NewsEntity>> = newsDao.getAllNews()

    fun getFavoriteNews(): Flow<List<NewsEntity>> = newsDao.getFavoriteNews()

    suspend fun insertNews(newsList: List<NewsEntity>) = newsDao.insertNews(newsList)

    fun setFavoriteNews(news: NewsEntity, isFavorite: Boolean) {
        news.isFavorite = isFavorite
        newsDao.updateFavoriteNews(news)
    }
}
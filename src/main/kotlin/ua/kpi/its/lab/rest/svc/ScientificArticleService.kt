package ua.kpi.its.lab.rest.svc

import ua.kpi.its.lab.rest.entity.ScientificArticle

interface ScientificArticleService {
    fun create(module: ScientificArticle): ScientificArticle
    fun getById(id: Long): ScientificArticle?
    fun update(module: ScientificArticle): ScientificArticle
    fun deleteById(id: Long)
    fun getAll(): List<ScientificArticle>
}
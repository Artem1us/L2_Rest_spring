package ua.kpi.its.lab.rest.svc.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ua.kpi.its.lab.rest.entity.ScientificArticle
import ua.kpi.its.lab.rest.repo.ScientificArticleRepository
import ua.kpi.its.lab.rest.svc.ScientificArticleService

@Service
class ScientificArticleServiceImpl @Autowired constructor(
    private val articleRepository: ScientificArticleRepository
) : ScientificArticleService {
    override fun create(article: ScientificArticle): ScientificArticle {
        return articleRepository.save(article)
    }

    override fun getById(id: Long): ScientificArticle? {
        return articleRepository.findById(id).orElse(null)
    }

    override fun update(article: ScientificArticle): ScientificArticle {
        return articleRepository.save(article)
    }

    override fun deleteById(id: Long) {
        articleRepository.deleteById(id)
    }

    override fun getAll(): List<ScientificArticle> {
        return articleRepository.findAll()
    }
}
package ua.kpi.its.lab.rest.svc

import ua.kpi.its.lab.rest.entity.Magazine

interface MagazineService {
    fun create(product: Magazine): Magazine
    fun getById(id: Long): Magazine?
    fun update(product: Magazine): Magazine
    fun deleteById(id: Long)
    fun getAll(): List<Magazine>
}
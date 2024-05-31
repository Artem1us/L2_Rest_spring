package ua.kpi.its.lab.rest.entity

import jakarta.persistence.*


@Entity
data class Magazine(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val name: String,
    val topic: String,
    val language: String,
    val establishDate: String,
    val issn: String,
    val price: String,
    val periodicity: Boolean,

    @OneToMany(mappedBy = "magazine1", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val articles: List<ScientificArticle> = emptyList()
) : Comparable<Magazine> {
    override fun compareTo(other: Magazine): Int {
        val nameComparison = name.compareTo(other.name)
        return if (nameComparison != 0) {
            nameComparison
        } else {
            id.compareTo(other.id)
        }
    }

    override fun toString(): String {
        return "Magazine(id=$id, name='$name', developer='$topic', version='$language', releaseDate='$establishDate', size=$issn, bitness='$price', crossPlatform=$periodicity)"
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}
package com.ir.homework12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val material = Object.string
        var features = ""
        when (material) {
            "Apple" -> {
                features =
                    "An apple is a juicy fruit of an apple tree, which is eaten fresh, serves as a raw material in cooking and for making drinks. The domestic apple tree is the most widespread, the plum-leaved apple tree is less commonly grown. The size of red, green or yellow spherical fruits is 5-13 cm in diameter. It comes from Central Asia, where the wild-growing ancestor of the domestic apple tree, the Sievers apple tree, still grows [1]. To date, there are many varieties of this type of apple tree, growing in various climatic conditions. By ripening time, summer, autumn and winter varieties are distinguished, later varieties are distinguished by good resistance."
            }
            "Kiwi" -> {
                features =
                    "Kiwi, (Actinidia deliciosa), also called kiwifruit or Chinese gooseberry, woody vine and edible fruit of the family Actinidiaceae. The plant is native to mainland China and Taiwan and is also grown commercially in New Zealand and California. The fruit has a slightly acid taste and can be eaten raw or cooked."
            }
            "Orange" -> {
                features =
                    "The term orange may refer to a number of citrus trees that produces fruit for people to eat. Oranges are a very good source of Vitamin C.[1] Orange juice is an important part of many people's breakfast. The \"sweet orange\", which is the kind that are most often eaten today, grew first in South and East Asia but now grows in lots of parts of the world.\n" +
                            "\n" +
                            "Oranges are round orange-coloured fruit that grow on a tree which can reach 10 metres (33 ft) high. Orange trees have dark green shiny leaves and small white flowers with five petals. The flowers smell very sweet which attracts many bees.\n" +
                            "\n" +
                            "An orange has a tough shiny orange skin that holds acid in outside layer. Inside, the fruit is divided into \"segments\", which have thin tough skins that hold together many little sections with juice inside. There are usually ten segments in an orange, but sometimes there are more or less. Inside each segment of most types of orange there are seeds called \"pips\". Orange trees can be grown from pips, but some types of orange trees can only be grown from \"cuttings\" (a piece cut off a tree and made to grow roots). The segments and the skin are separated by white stringy fibrous material called \"pith\". In most types of oranges, the skin can be peeled off the pith, and the segments can be pulled apart with the fingers to be eaten. In some oranges it is hard to take the skin off. Orange skin is often called \"orange peel\"."
            }
            "Rose" -> {
                features =
                    "A rose is a woody perennial flowering plant of the genus Rosa, in the family Rosaceae, or the flower it bears. There are over three hundred species and tens of thousands of cultivars.[citation needed] They form a group of plants that can be erect shrubs, climbing, or trailing, with stems that are often armed with sharp prickles.[citation needed] Their flowers vary in size and shape and are usually large and showy, in colours ranging from white through yellows and reds. Most species are native to Asia, with smaller numbers native to Europe, North America, and northwestern Africa.[citation needed] Species, cultivars and hybrids are all widely grown for their beauty and often are fragrant. Roses have acquired cultural significance in many societies. Rose plants range in size from compact, miniature roses, to climbers that can reach seven meters in height.[citation needed] Different species hybridize easily, and this has been used in the development of the wide range of garden"
            }
            "Pink cosmos" -> {
                features =
                    "Pink – Pink cosmos represent the most delicate aspects of love such as kisses and hugs. Since pink is usually associated with femininity, these flowers sometimes also represent a mother's love. Yellow – Yellow cosmos flowers most commonly symbolize friendship, like most other yellow flowers"
            }
            "Sunflower" -> {
                features =
                    "The sunflower (Helianthus annuus) is a living annual plant in the family Asteraceae, with a large flower head (capitulum). The stem of the flower can grow up to 3 metres tall, with a flower head that can be 30 cm wide."
            }
            "Dog" -> {
                features =
                    "A dog is a pet, one of the most popular companion animals. The domestic dog was described as an independent biological species Canis familiaris by Linnaeus in 1758; this scientific name is now recognized by many authoritative organizations, such as the American Society of Mammalians."
            }
            "Lion" -> {
                features =
                    "The lion is a species of predatory mammals, one of the five members of the panther genus, belonging to the subfamily of big cats in the cat family. Along with the tiger, it is the largest living cat, the weight of some males can reach 250 kg."
            }
            "Fox" -> {
                features =
                    "The fox is a predatory mammal, belongs to the carnivorous order, the canine family. The Latin name of the fox genus, apparently, comes from distorted words: the Latin \"lupus\" and the German \"Wolf\", translated as \"wolf\"."
            }
            "Humming" -> {
                features =
                    "Translated from English.-Buzzing is a sound produced by a silent tone with the mouth closed, causing the sound to come out of the nose. Buzz means to produce such a sound, often with a melody. It's also associated with thoughtful absorption, \"hmm.\" The hum has a definite timbre, usually monotonous or with slightly varying tones."
            }
            "Macaw" -> {
                features =
                    "Translated from English. -Ara are a group of New World parrots, long-tailed and often colorful. They are popular in poultry farming or as companion parrots, although there are concerns about the conservation of some species in the wild."
            }
            "Dove" -> {
                features =
                    "Pigeons are the only modern family of birds from the order Pigeons. The family consists of about 300 species, divided into 41 genera. The family includes pigeons and doves, widespread in the Old and New Worlds. The greatest biodiversity of species is observed in South, Southeast Asia and Australia."
            }
        }
        tv_materialName.text = material
        tv_features.text = features
    }
}
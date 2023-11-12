package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val subtitle: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Lorem ipsum is simple dummy",
        subtitle = "Lorem ipsum is simple dummy text of the printing and typeseeing industry",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Lorem ipsum is simple dummy",
        subtitle = "Lorem ipsum is simple dummy text of the printing and typeseeing industry",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Lorem ipsum is simple dummy",
        subtitle = "Lorem ipsum is simple dummy text of the printing and typeseeing industry",
        image = R.drawable.onboarding3
    ),
)
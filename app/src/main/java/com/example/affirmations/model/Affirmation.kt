package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// Data classes must have at least one property defined.
data class Affirmation(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int)
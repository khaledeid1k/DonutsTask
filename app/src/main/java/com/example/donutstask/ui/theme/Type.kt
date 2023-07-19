package com.example.donutstask.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.donutstask.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

private val Poppins = FontFamily(
    Font(R.font.poppins_light, FontWeight.W300),
    Font(R.font.poppins_regular, FontWeight.W400),
    Font(R.font.poppins_medium, FontWeight.W500),
    Font(R.font.poppins_bold, FontWeight.W600),
)


val NerkoOne = FontFamily(
    Font(R.font.nerko_one_regular, weight = FontWeight.Normal),
)

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = textSizeZero


    ),
    bodyMedium = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        letterSpacing = 0.5.sp
    ),


    )
    */



val poppins = FontFamily(
    Font(R.font.poppins, FontWeight.Normal),
    Font(R.font.poppins_semibold, FontWeight.SemiBold)
)

val GooglePoppinsTypography = Typography(
    headlineSmall = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        letterSpacing = 0.sp
    ),
    titleSmall = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    bodySmall = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        letterSpacing = 0.sp
    )

)

object Type {
    val Caption = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Normal,
        fontSize = textSize12,
        letterSpacing = textSize0
    )

    val Body = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_light)),
        fontWeight = FontWeight.Medium,
        fontSize = textSize14,
    )

    val Title = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_black)),
        fontWeight = FontWeight.Bold,
        fontSize = textSize54,
        color = lightTextColor,
    )

    val SubTitle = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_light)),
        fontWeight = FontWeight.Medium,
        fontSize = textSize18,
        color = lightTextColor,
    )
    val SubTitle2 =  TextStyle(
        fontSize = 14.sp,
        fontFamily = FontFamily(Font(R.font.inter_light)),
        fontWeight = FontWeight.Normal,
        color = Color(0x99000000),
        letterSpacing = 0.7.sp,
    )
    val Title2 = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_light)),
        fontWeight = FontWeight.SemiBold,
        fontSize = textSize30,
        color = lightTextColor,
    )
    val TextButton = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_medium)),
        fontWeight = FontWeight.SemiBold,
        fontSize = textSize20,
    )

    val Headline = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = textSize16,
        letterSpacing = textSize0
    )

    val Large = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = textSize24,
        letterSpacing = textSize0
    )

    val GraphicTextNormal = TextStyle(
        fontFamily = NerkoOne,
        fontWeight = FontWeight.Normal,
        fontSize = textSize24,
        letterSpacing = textSize0
    )

    val GraphicTextLarge = TextStyle(
        fontFamily = NerkoOne,
        fontWeight = FontWeight.Normal,
        fontSize = textSize32,
        letterSpacing = textSize0
    )


}
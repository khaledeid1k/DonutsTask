package com.example.donutstask.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutstask.R
import com.example.donutstask.ui.theme.Brand400
import com.example.donutstask.ui.theme.Brand600
import com.example.donutstask.ui.theme.ButtonHeight
import com.example.donutstask.ui.theme.LightPrimary
import com.example.donutstask.ui.theme.LightTertiary
import com.example.donutstask.ui.theme.LightWhite500
import com.example.donutstask.ui.theme.Type
import com.example.donutstask.ui.theme.Type.SubTitle2
import com.example.donutstask.ui.theme.Type.TextButton
import com.example.donutstask.ui.theme.lightBackgroundColor
import com.example.donutstask.ui.theme.lightTextColor
import com.example.donutstask.ui.theme.radius15
import com.example.donutstask.ui.theme.radius40
import com.example.donutstask.ui.theme.space16
import com.example.donutstask.ui.theme.space32
import com.example.donutstask.ui.theme.space40
import com.example.donutstask.ui.theme.space6
import com.example.donutstask.ui.theme.space8
import com.example.donutstask.ui.theme.textSize24
import com.example.donutstask.ui.theme.textSize30
import java.time.temporal.TemporalQueries.offset

@Composable
fun SingleDonut() {
    SingleDonutContent()
}

@Preview
@Composable
fun SingleDonutContent() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = lightBackgroundColor
            )
    ) {
        Icon(
            modifier = Modifier
                .padding(
                    space6
                )
                .size(50.dp),
            imageVector = Icons.Default.KeyboardArrowLeft,
            contentDescription = stringResource(R.string.search_icon),
            tint = lightTextColor
        )
        Image(
            painter = painterResource(id = R.drawable.single_donut),
            contentDescription = "", modifier =
            Modifier
                .padding(bottom = space32)
                .fillMaxWidth()
                .size(180.dp)
        )


        Box(
            modifier = Modifier

                .clip(
                    shape = RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 30.dp,
                    )
                )
                .fillMaxSize()
                .background(LightWhite500)


        ) {
            Column {
                Text(
                    modifier = Modifier
                        .padding(start = space16)
                        .padding(vertical = space16),
                    text = stringResource(R.string.strawberry_wheel),
                    style = Type.Title2
                )

                Text(
                    modifier = Modifier
                        .padding(start = space16, bottom = space16),
                    text = stringResource(R.string.about_gonut),
                    style = Type.SubTitle,
                    fontFamily = FontFamily(Font(R.font.inter_medium)),
                    color = Brand400,

                    )
                Text(
                    modifier = Modifier
                        .padding(end = space32, start = space16, bottom = space16),
                    text = stringResource(R.string.describe),
                    style = SubTitle2
                )
                Text(
                    modifier = Modifier
                        .padding(start = space16, bottom = space16),
                    text = stringResource(R.string.quantity),
                    style = Type.SubTitle,
                    fontFamily = FontFamily(Font(R.font.inter_medium)),
                    color = Brand400,
                )
                Row(
                    modifier = Modifier
                        .background(LightTertiary)
                        .padding(
                            start = space16
                        )
                ) {
                    Box(

                        modifier = Modifier
                            .padding(end = space16)
                            .width(45.dp)
                            .height(45.dp)

                            .clip(RoundedCornerShape(radius15))
                            .background(
                                shape =
                                RectangleShape, color = LightWhite500
                            )

                    ) {

                        Icon(
                            modifier = Modifier
                                .align(Alignment.TopCenter)
                                .padding(
                                    space6
                                ),
                            painter = painterResource(id = R.drawable.minimize),
                            contentDescription = stringResource(R.string.search_icon),
                            tint = LightPrimary
                        )
                    }
                    Box(

                        modifier = Modifier

                            .padding(end = space16)

                            .width(45.dp)
                            .height(45.dp)
                            .clip(RoundedCornerShape(radius15))
                            .background(
                                shape =
                                RectangleShape, color = LightWhite500
                            )

                    ) {

                        Text(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .padding(
                                    space6
                                ),
                            text = "1",
                            style = TextButton
                        )
                    }

                    Box(

                        modifier = Modifier
                            .width(45.dp)
                            .height(45.dp)

                            .clip(RoundedCornerShape(radius15))
                            .background(
                                shape =
                                RectangleShape, color = Brand600
                            )

                    ) {

                        Icon(
                            modifier = Modifier.align(Alignment.Center),
                            painter = painterResource(id = R.drawable.add),
                            contentDescription = stringResource(R.string.search_icon),
                            tint = LightWhite500
                        )
                    }
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(start = space16, top = space32)
                ) {
                    Text(
                        modifier = Modifier
                            .padding(end = space40),
                        text = "$16",
                        style = TextButton,
                        fontSize = textSize30,
                        color = Brand600,
                        fontWeight = FontWeight.Bold
                    )
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(
                            contentColor = LightWhite500,
                            containerColor = lightTextColor
                        ),
                        shape = RoundedCornerShape(radius40),
                        modifier = Modifier
                            .height(ButtonHeight)
                    ) {
                        Text(
                            text = stringResource(R.string.add_to_cart),
                            style = TextButton,
                            modifier = Modifier.padding(horizontal = space40)
                        )
                    }
                }
//                Box(
//                    modifier = Modifier
//                        .padding(end = space32)
//                        .align(Alignment.End)
//                        .graphicsLayer {
//                            translationY = 30.dp.toPx() // Adjust this value as needed
//
//                        }
//                        .clip(RoundedCornerShape(radius15))
//                        .background(
//                            shape =
//                            RectangleShape, color = LightWhite500
//                        )
//                ) {
//                    Icon(
//                        modifier = Modifier
//                            .size(70.dp).padding(
//                                space8
//                            ),
//                        imageVector = Icons.Default.FavoriteBorder,
//                        contentDescription = stringResource(R.string.search_icon),
//                        tint = lightTextColor
//                    )
//                }
            }
        }


    }

}
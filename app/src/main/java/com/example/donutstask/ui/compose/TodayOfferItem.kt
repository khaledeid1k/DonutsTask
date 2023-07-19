package com.example.donutstask.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.donutstask.R
import com.example.donutstask.ui.theme.Brand500
import com.example.donutstask.ui.theme.LightPrimary
import com.example.donutstask.ui.theme.MaxLines
import com.example.donutstask.ui.theme.TextWidth
import com.example.donutstask.ui.theme.Type
import com.example.donutstask.ui.theme.Type.Body
import com.example.donutstask.ui.theme.lightBackgroundColor
import com.example.donutstask.ui.theme.lightTextColor
import com.example.donutstask.ui.theme.radius15
import com.example.donutstask.ui.theme.space16
import com.example.donutstask.ui.theme.space32
import com.example.donutstask.ui.theme.space40
import com.example.donutstask.ui.theme.space6
import com.example.donutstask.ui.theme.space60
import com.example.donutstask.ui.theme.space76
import com.example.donutstask.ui.theme.textSize24

@Preview
@Composable
fun TodayOffer() {
    ConstraintLayout(

        modifier = Modifier
        ) {
        val (image, column) = createRefs()

        Column(
            modifier = Modifier

                .constrainAs(column) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                }
                .padding(end= space40)
                .clip(RoundedCornerShape(space16))
                .background(Brand500)
        ) {

            Box(
                modifier = Modifier

                    .padding(
                        space32
                    ).padding(
                        bottom= space40
                    )
                    .clip(RoundedCornerShape(radius15))
                    .background(
                        shape =
                        RectangleShape, color = lightBackgroundColor
                    )
            ) {
                Icon(
                    modifier = Modifier.padding(
                        space6
                    ),
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = stringResource(R.string.search_icon),
                    tint = lightTextColor
                )
            }

            Text(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(start = space32, top = space16),
                text = stringResource(R.string.strawberry_wheel),
                style = Type.TextButton,
                color = LightPrimary
            )

            Text(
                modifier = Modifier.
                   width(TextWidth)
                    .padding(horizontal = space40),
                text = stringResource(R.string.these_baked_strawberry_donuts_are_filled_with_fresh_strawberries),
                style =Body,
                letterSpacing = 0.6.sp,
                maxLines = MaxLines,
                overflow = TextOverflow.Ellipsis,
                color = LightPrimary
            )
            Row (modifier = Modifier.
                padding(bottom = space16)
                    .align(Alignment.End)){

                Text(
                    modifier = Modifier
                        .padding(end = space6)
                        .align(Alignment.Bottom)
                    ,
                    textDecoration = TextDecoration.LineThrough,

                    text = "$20",
                    style = Body,
                    fontWeight = FontWeight.SemiBold,
                    color = LightPrimary
                )
                Text(
                    modifier = Modifier
                        .padding(end = space40),
                    text = "$16",
                    style = Type.TextButton,
                    fontSize = textSize24,
                    color = LightPrimary,
                    fontWeight = FontWeight.Bold
                )
            }

        }
        Image(
            painter = painterResource(id = R.drawable.single_donut),
            contentDescription = "", modifier =
            Modifier
                .constrainAs(image) {
                    end.linkTo(parent.end)
                    top.linkTo(parent.top, space32)
                }

        )
    }

}
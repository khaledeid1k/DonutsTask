package com.example.donutstask.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.donutstask.R
import com.example.donutstask.ui.theme.LightPrimary
import com.example.donutstask.ui.theme.LightWhite500
import com.example.donutstask.ui.theme.Type.Body
import com.example.donutstask.ui.theme.Type.Title2
import com.example.donutstask.ui.theme.space16
import com.example.donutstask.ui.theme.space32
import com.example.donutstask.ui.theme.space33
import com.example.donutstask.ui.theme.space40
import com.example.donutstask.ui.theme.space8
import com.example.donutstask.ui.theme.textSize14
import com.example.donutstask.ui.theme.textSize30

@Preview
@Composable
fun DonutItem() {
    ConstraintLayout(modifier = Modifier.wrapContentSize()) {
        val (image, card) = createRefs()

        Card (modifier = Modifier
            .width(138.dp)
            .shadow(elevation = 150.dp, spotColor = Color(0x1A000000), ambientColor = Color(0x1A000000))
            .constrainAs(card) {
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)

        },
            colors = CardDefaults.cardColors(
                containerColor = LightWhite500,
            )){
            Column(horizontalAlignment =
            Alignment.CenterHorizontally,
                modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text(
                    modifier = Modifier.padding(horizontal = space8)
                        .padding(top = space32),
                    text = "Chocolate Cherry",
                    style = Body,
                    color = LightPrimary
                )
                Text(text = "$22",
                    modifier = Modifier.padding(bottom = space16),

                    style = Title2,
                    fontSize = textSize14,)
            }
        }
        Image(modifier = Modifier
            .padding(bottom = space40)
            .constrainAs(image) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            },painter = painterResource(id =
        R.drawable.donut_item)
            , contentDescription = "")
    }
}
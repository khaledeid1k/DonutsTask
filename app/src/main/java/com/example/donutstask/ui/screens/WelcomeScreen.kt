package com.example.donutstask.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.donutstask.R
import com.example.donutstask.ui.theme.ButtonHeight
import com.example.donutstask.ui.theme.Dark
import com.example.donutstask.ui.theme.LightWhite500
import com.example.donutstask.ui.theme.Type
import com.example.donutstask.ui.theme.lightBackgroundColor
import com.example.donutstask.ui.theme.lightTextColor
import com.example.donutstask.ui.theme.radius50
import com.example.donutstask.ui.theme.space16
import com.example.donutstask.ui.theme.space18
import com.example.donutstask.ui.theme.space19
import com.example.donutstask.ui.theme.space33
import com.example.donutstask.ui.theme.space40
import com.example.donutstask.ui.theme.space46
import com.example.donutstask.ui.theme.space50
import com.example.donutstask.ui.theme.space60
import com.example.donutstask.ui.theme.space72

@Composable
fun WelcomeScreen() {
    WelcomeScreenContent()
}
@Preview
@Composable
fun WelcomeScreenContent() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(color = lightBackgroundColor)
    ){
        val (donut1, donut2,donut3,donut4,donut,title,title2,button) = createRefs()
        Image(painter = painterResource(id = R.drawable.donut1),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .width(186.dp)
                        .height(186.dp)
                        .constrainAs(donut1) {
                            start.linkTo(parent.start)
                            top.linkTo(parent.top)
                        })

        Image(painter = painterResource(id = R.drawable.donut2),
            contentDescription = null,
            contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .width(210.dp)
                        .height(155.dp)
                        .constrainAs(donut2) {
                            end.linkTo(parent.end, space33)
                            top.linkTo(parent.top, space40)
                            start.linkTo(donut1.end, space18)
                        })


        Image(painter = painterResource(id = R.drawable.donut),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .width(700.dp)
                        .height(401.dp)
                        .constrainAs(donut) {
                            end.linkTo(parent.end)
                            top.linkTo(parent.top, space50)
                            start.linkTo(parent.start)
                        })
        Image(painter = painterResource(id = R.drawable.donut3),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .width(209.dp)
                        .height(165.dp)
                        .constrainAs(donut3) {
                            end.linkTo(parent.end)
                            top.linkTo(parent.top, 300.dp)
                        })

        Image(painter = painterResource(id = R.drawable.donut4),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .width(94.dp)
                        .height(69.dp)
                        .constrainAs(donut4) {
                            start.linkTo(parent.start)
                                bottom.linkTo(title.top, 98.dp)
                        })
        Text(text = stringResource(R.string.gonuts_with_donuts),
            style = Type.Title,
            color = lightTextColor,
                    modifier = Modifier
                        .constrainAs(title) {
                            start.linkTo(parent.start, space40)
                            bottom.linkTo(title2.top, space19)
                        })

        Text(text = stringResource(R.string.describe_donuts),
            style = Type.SubTitle,
            color = lightTextColor,
                    modifier = Modifier
                        .constrainAs(title2) {
                            start.linkTo(parent.start, space40)
                            end.linkTo(parent.end, space40)

                            bottom.linkTo(button.top, space60)
                        })
        Button(
            onClick = {  },
            colors = ButtonDefaults.buttonColors(contentColor = Dark, containerColor = LightWhite500),
            shape = RoundedCornerShape(radius50),
            modifier = Modifier
                . fillMaxWidth()
                .constrainAs(button) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom, space46)
                }
                .padding(horizontal = space40)
                .height(ButtonHeight)) {

            Text(
                text = "Get Started",
                style =Type.TextButton

            )
        }
    }


}
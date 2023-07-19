package com.example.donutstask.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavHostController
import com.example.donutstask.R
import com.example.donutstask.ui.nav.navigateToHomeScreen
import com.example.donutstask.ui.theme.ButtonHeight
import com.example.donutstask.ui.theme.LightPrimary
import com.example.donutstask.ui.theme.LightWhite500
import com.example.donutstask.ui.theme.Type
import com.example.donutstask.ui.theme.lightBackgroundColor
import com.example.donutstask.ui.theme.radius50
import com.example.donutstask.ui.theme.space16
import com.example.donutstask.ui.theme.space19
import com.example.donutstask.ui.theme.space40

@Composable
fun WelcomeScreen(
    navController: NavHostController) {
    WelcomeScreenContent(navController)
}
@Composable
fun WelcomeScreenContent(navController: NavHostController) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(color = lightBackgroundColor)
    ){
        val (donuts, donut2,donut3,donut4,donut,title,title2,button) = createRefs()
        Image(painter = painterResource(id = R.drawable.donuts),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .constrainAs(donuts) {
                            start.linkTo(parent.start)
                            top.linkTo(parent.top)
                            bottom.linkTo(title.top)
                            end.linkTo(parent.end)
                            width = Dimension.fillToConstraints
                            height = Dimension.fillToConstraints
                        })
        Text(text = stringResource(R.string.gonuts_with_donuts),
            style = Type.Title,

                    modifier = Modifier
                        .constrainAs(title) {
                            start.linkTo(parent.start, space40)
                            bottom.linkTo(title2.top, space19)
                        })

        Text(text = stringResource(R.string.describe_donuts),
            style = Type.SubTitle,

                    modifier = Modifier
                        .constrainAs(title2) {
                            start.linkTo(parent.start, space40)
                            end.linkTo(parent.end, space40)

                            bottom.linkTo(button.top, space16)
                        })
        Button(
            onClick =   navController::navigateToHomeScreen,
            colors = ButtonDefaults.buttonColors(contentColor = LightPrimary, containerColor = LightWhite500),
            shape = RoundedCornerShape(radius50),
            modifier = Modifier
                . fillMaxWidth()
                .constrainAs(button) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom, space16)
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
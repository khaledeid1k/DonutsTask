package com.example.donutstask.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.donutstask.R
import com.example.donutstask.ui.compose.DonutItem
import com.example.donutstask.ui.compose.TodayOffer
import com.example.donutstask.ui.nav.navigateToHomeScreen
import com.example.donutstask.ui.nav.navigateToSingleDonut
import com.example.donutstask.ui.theme.LightPrimary
import com.example.donutstask.ui.theme.LightWhite500
import com.example.donutstask.ui.theme.Type.Body
import com.example.donutstask.ui.theme.Type.TextButton
import com.example.donutstask.ui.theme.Type.Title2
import com.example.donutstask.ui.theme.lightBackgroundColor
import com.example.donutstask.ui.theme.lightTextColor
import com.example.donutstask.ui.theme.radius15
import com.example.donutstask.ui.theme.space16
import com.example.donutstask.ui.theme.space50
import com.example.donutstask.ui.theme.space6

@Composable
fun Home(navController: NavController) {
    HomeContent(navController)
}
@Composable
fun HomeContent(navController: NavController) {
Column (
    verticalArrangement = Arrangement.Top,
modifier = Modifier
    .fillMaxSize()
    .background(color = LightWhite500)){

    Row (modifier = Modifier
        .padding(top = space16)) {
        Text(modifier = Modifier
            .padding(start = space16)
            .weight(1f),text = stringResource(R.string.let_s_gonuts),
            style = Title2)

        Box (modifier = Modifier
            .padding(top=space16, end = space16)
            .clip(RoundedCornerShape(radius15))
            .background(
                shape =
                RectangleShape, color = lightBackgroundColor
            )){
            Icon(
                modifier = Modifier.padding(
                    space6),
                imageVector = Icons.Default.Search,
                contentDescription = stringResource(R.string.search_icon),
                tint = lightTextColor
            )
        }

    }
    Text(modifier = Modifier
        .wrapContentSize()
        .padding(start = space16)
        ,text = stringResource(R.string.order_your_favourite),
        style = Body,
        color = LightPrimary
    )

    Text(modifier = Modifier
        .wrapContentSize()
        .padding(start = space16)
        ,text = stringResource(R.string.today_offers),
        style = TextButton,
        color = LightPrimary,
        fontWeight = FontWeight.Bold)
    LazyRow(
        modifier = Modifier
            .clickable(
                onClick= navController::navigateToSingleDonut
            )
            .padding(start = space16),
        contentPadding = PaddingValues(space16),
        horizontalArrangement = Arrangement.spacedBy(space16)
    ) {
        items(5) {
            TodayOffer()

        }
    }
    Text(modifier = Modifier
        .wrapContentSize()
        .padding(start = space16)
        ,text = stringResource(R.string.today_offers),
        style = TextButton,
        color = LightPrimary,
        fontWeight = FontWeight.Bold)
    LazyRow(
        modifier = Modifier ,
        contentPadding = PaddingValues(space16),
        horizontalArrangement = Arrangement.spacedBy(space16)
    ) {
        items(5) {
            DonutItem()

        }

    }
}
}
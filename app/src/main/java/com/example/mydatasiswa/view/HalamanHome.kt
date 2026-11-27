package com.example.mydatasiswa.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mydatasiswa.R
import com.example.mydatasiswa.modeldata.DataSiswa
import com.example.mydatasiswa.uicontroller.route.DestinasiHome
import com.example.mydatasiswa.viewmodel.HomeViewModel
import com.example.mydatasiswa.viewmodel.PenyediaViewModel
import com.example.mydatasiswa.viewmodel.StatusUiSiswa

@Composable
fun LoadingScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier, contentAlignment = Alignment.Center) {
        CircularProgressIndicator()
    }
}

@Composable
fun ErrorScreen(retryAction: () -> Unit, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.gagal_memuat),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium))
        )
        Button(onClick = retryAction) {
            Text(stringResource(R.string.coba_lagi))
        }
    }
}

@Composable
fun DaftarSiswa(
    itemSiswa: List<DataSiswa>,
    modifier: Modifier = Modifier
){
    LazyColumn(modifier = modifier){
        items(items = itemSiswa, key = { it.id }){ siswa ->
            ItemSiswa(
                siswa = siswa,
                modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_small))
            )
        }
    }
}

@Composable
fun ItemSiswa(
    siswa: DataSiswa,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ){
        Column(
            modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_large)),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_small))
        ){
            Row(modifier = Modifier.fillMaxWidth()){
                Text(
                    text = siswa.nama,
                    style = MaterialTheme.typography.titleLarge,
                )
                Spacer(Modifier.weight(1f))
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = null,
                )
                Text(
                    text = siswa.telpon,
                    style = MaterialTheme.typography.titleMedium
                )
            }
            Text(
                text = siswa.alamat,
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}

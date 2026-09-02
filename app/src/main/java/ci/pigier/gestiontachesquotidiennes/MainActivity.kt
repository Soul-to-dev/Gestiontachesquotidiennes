package ci.pigier.gestiontachesquotidiennes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ci.pigier.gestiontachesquotidiennes.ui.theme.GestionTachesQuotidiennesTheme
// Activité principale de l'application
class ActivitePrincipale : ComponentActivity() {
    override fun onCreate(etatSauvegarde: Bundle?) {
        super.onCreate(etatSauvegarde)
        enableEdgeToEdge()
        setContent {
            GestionTachesQuotidiennesTheme {
                EcranTachesTerminees(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

// Écran affiché lorsque toutes les tâches du jour sont terminées
@Composable
fun EcranTachesTerminees(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(id = R.drawable.ic_task_completed),
            contentDescription = null
        )
        Text(
            text = stringResource(R.string.toutes_les_taches_terminees),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = stringResource(R.string.beau_travail),
            fontSize = 16.sp
        )
    }
}

// Aperçu de l'écran dans Android Studio
@Preview(showBackground = true)
@Composable
fun ApercuEcranTachesTerminees() {
    GestionTachesQuotidiennesTheme {
        EcranTachesTerminees(modifier = Modifier.fillMaxSize())
    }
}
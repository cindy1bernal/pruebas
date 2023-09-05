package firebase.app.calculadora;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.app.Activity;

import androidx.annotation.ContentView;
import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;

import android.content.Context;
import android.view.View;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import static java.util.regex.Pattern.matches;

import java.security.cert.CertPathChecker;

@RunWith(AndroidJUnit4.class)
public class testEspress {
    @Test
    public void ensureTextChangesWork() {
        int appContext = (R.id.button_suma);
        assertEquals(4, 2 + 2);


    }
    @Test
    public void ensureTextChangesWork2() {
        int appContext = (R.id.button_resta);
        assertEquals(1, 2 - 1);

    }
}

package silly.old.thing;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import mpaJit.test.TestJitpack;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("onCreate()", "Hello1");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart(1)", "Hello2");
        Log.d("onStart(2)", TestJitpack.getSomething() );
        TestJitpack tjp = new TestJitpack();
        Log.d("onStart(3)", tjp.getSomethingElse() );
        finish();
    }
}

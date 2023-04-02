package com.example.appforhack.ui.learningBase;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.appforhack.R;
import com.example.appforhack.databinding.FragmentLearningbaseBinding;

public class LearningBase extends Fragment implements View.OnClickListener {

    Button securityButton, regButton, ProjectButton;
    TextView security_text, regText, ProjectText;
    boolean flag;

    private FragmentLearningbaseBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentLearningbaseBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        securityButton = root.findViewById(R.id.security_button);
        securityButton.setOnClickListener(this);

        regButton = root.findViewById(R.id.reg_button);
        regButton.setOnClickListener(this);

        ProjectButton = root.findViewById(R.id.project_button);
        ProjectButton.setOnClickListener(this);

        security_text = root.findViewById(R.id.security_text);
        regText = root.findViewById(R.id.reg_text);
        ProjectText = root.findViewById(R.id.project_text);

        flag = false;
        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.security_button:
                if (!flag) {
                    security_text.setText("Техника безопасности для программиста — это залог долговременной и беспроблемной работы такого специалиста. Техника безопасности программистов регулируется «Инструкцией по охране труда», где все разложено по пунктам и очень подробно описано. Знать ее нужно, если программист работает в большом офисном здании, где к его компьютеру имеют косвенный доступ несколько человек. В этом случае он обязан следовать инструкциям техники безопасности, чтобы не подвергать опасности свое здоровье и здоровье окружающих его коллег. Плюс программист просто обязан знать, как вести себя во время чрезвычайных ситуаций.\n" +
                            "\n" +
                            "Обычно техника безопасности программиста зачитывается специалистами по безопасности труда в каждой организации, где трудятся программисты, либо она доступна для прочтения каждым сотрудником. А раз в год, иногда и чаще, все сотрудники расписываются, что ознакомлены с техникой безопасности. Фактически технику безопасности мало кто читает, мало кто знает и мало кто соблюдает, потому что все ограничивается тем, что программисты просто расписываются в журнале, будто они «ознакомлены», и спокойно работают дальше.");
                    flag = !flag;
                }
                else {
                    security_text.setText("");
                    flag = !flag;
                }
                break;
            case R.id.reg_button:
                if (!flag) {
                regText.setText("Техника безопасности для программиста — это залог долговременной и беспроблемной работы такого специалиста. Техника безопасности программистов регулируется «Инструкцией по охране труда», где все разложено по пунктам и очень подробно описано. Знать ее нужно, если программист работает в большом офисном здании, где к его компьютеру имеют косвенный доступ несколько человек. В этом случае он обязан следовать инструкциям техники безопасности, чтобы не подвергать опасности свое здоровье и здоровье окружающих его коллег. Плюс программист просто обязан знать, как вести себя во время чрезвычайных ситуаций.\n" +
                        "\n" +
                        "Обычно техника безопасности программиста зачитывается специалистами по безопасности труда в каждой организации, где трудятся программисты, либо она доступна для прочтения каждым сотрудником. А раз в год, иногда и чаще, все сотрудники расписываются, что ознакомлены с техникой безопасности. Фактически технику безопасности мало кто читает, мало кто знает и мало кто соблюдает, потому что все ограничивается тем, что программисты просто расписываются в журнале, будто они «ознакомлены», и спокойно работают дальше.");
                flag = !flag;
            }
            else {
                regText.setText("");
                flag = !flag;
            }
            break;
            case R.id.project_button:
                if (!flag) {
                    ProjectText.setText("Техника безопасности для программиста — это залог долговременной и беспроблемной работы такого специалиста. Техника безопасности программистов регулируется «Инструкцией по охране труда», где все разложено по пунктам и очень подробно описано. Знать ее нужно, если программист работает в большом офисном здании, где к его компьютеру имеют косвенный доступ несколько человек. В этом случае он обязан следовать инструкциям техники безопасности, чтобы не подвергать опасности свое здоровье и здоровье окружающих его коллег. Плюс программист просто обязан знать, как вести себя во время чрезвычайных ситуаций.\n" +
                            "\n" +
                            "Обычно техника безопасности программиста зачитывается специалистами по безопасности труда в каждой организации, где трудятся программисты, либо она доступна для прочтения каждым сотрудником. А раз в год, иногда и чаще, все сотрудники расписываются, что ознакомлены с техникой безопасности. Фактически технику безопасности мало кто читает, мало кто знает и мало кто соблюдает, потому что все ограничивается тем, что программисты просто расписываются в журнале, будто они «ознакомлены», и спокойно работают дальше.");
                    flag = !flag;
                }
                else {
                    ProjectText.setText("");
                    flag = !flag;
                }
                break;
        }
    }
}

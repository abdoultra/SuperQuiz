package fr.abtraore.superquiz.ui.quiz;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.abtraore.superquiz.databinding.FragmentQuizBinding;
import fr.abtraore.superquiz.injection.ViewModelFactory;


public class QuizFragment extends Fragment {
    public static QuizFragment newInstance() {
        QuizFragment fragment = new QuizFragment();
        return fragment;
    }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this, ViewModelFactory.getInstance()).get(QuizViewModel.class);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentQuizBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    private FragmentQuizBinding binding;
    private QuizViewModel viewModel;

}
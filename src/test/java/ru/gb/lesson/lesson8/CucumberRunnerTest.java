package ru.gb.lesson.lesson8;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", plugin = "pretty", publish = true)
public class CucumberRunnerTest {
}

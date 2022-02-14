package com.practicePArtWithAdamB;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Adamb {
@ParameterizedTest
@ValueSource(ints = {1,2,3,4,5,6})
    public void test(int a){
    System.out.println(a);


}

public static ArrayList<String> StringProvider(){


    return new ArrayList<>(Arrays.asList("esat","Adam"));
}
@ParameterizedTest
@MethodSource("StringProvider")
public void test1(String str){
    System.out.println(str);

}
}

function solution(my_string) {
    let answer = my_string.replaceAll(/[a,e,i,o,u]/g, "");
    return answer;
}
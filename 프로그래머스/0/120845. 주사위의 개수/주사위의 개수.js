function solution(box, n) {
    let cnt1 = Math.floor(box[0]/n);
    let cnt2 = Math.floor(box[1]/n);
    let cnt3 = Math.floor(box[2]/n);

    return cnt1 * cnt2 * cnt3;
}
function findMax(arr){
    var max=arr[0];
    for(i=0;i<arr.length;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];
        }
    }
    return max;
}
var arr = [1,3,5,4,2,7,5,6,3,2,5];
console.log(findMax(arr));

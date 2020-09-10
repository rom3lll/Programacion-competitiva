class Solution {
    public int[] runningSum(int[] nums) {
    int auxiliar=0; //Auxiliar donde guardamos la suma
		int [] vector_respuesta=new int[nums.length];//creamos un arreglo de la misma longitud para guardar los valores
		vector_respuesta[0]=nums[0];//el ejercicio siempre inicia con el primer valor, entonces lo agregamos a la posicion [0]
		for (int i = 1; i < nums.length; i++) { //empezamos en 1 porque el primer valor fue agregado en la pos[0]
			auxiliar=auxiliar+nums[i-1]; // aux=0+1 -> aux=1+2 -> aux=3+3 -> aux=6+4 
			vector_respuesta[i]=nums[i]+auxiliar;//iniciamos en la pos i=1, asignamos al arreglo un valor
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i]=vector_respuesta[i];//agregamos los datos nuevamente en el vector nums
		}
    	return nums;
    }
}
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]

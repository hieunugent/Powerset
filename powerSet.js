function powerset(array) {
  // Write your code here.
	const results = [[]];
	for (const  ele of array){
		const length = results.length;
		for (let i = 0 ; i < length; i++){
			const result = results[i];
			results.push(result.concat(ele));
		}
	}
	return results;
	
}

// Do not edit the line below.
exports.powerset = powerset;
 

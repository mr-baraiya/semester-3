// Demonstrate the ReactJS props. (A)
// 2. Demonstrate the Event Handling in ReactJS. (A)
// 3. WAP in ReactJS to display the element if it has attribute called isDisplay to be true (using
// conditional rendering) (A)

import React from 'react';

function Welcome(props){
    const isComputer = props.isComputer;
    if(isComputer){
        return  (<h1>Computer Dept.</h1>);
    }
    else{
        return(<h1>Other Dept.</h1>);
    }
}

// function Welcome (props){
//     const isComputer = props.isComputer;
//     return(
//         <>
//             {isComputer && <h1>Computer Dept.</h1>}
//             {!(isComputer) && <h1>Other Dept.</h1>}
//         </>
//     );
// }

export default Welcome;